using System;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading;
using Microsoft.AspNetCore.Mvc;

namespace WebApplication.Controllers
{
    [Route("api/[controller]")]
    public class VotesController : Controller
    {
        // Guarda los votos. NOTA: ESTO NO ES THREAD SAFE ES SOLO POR LA DEMO.
        static Dictionary<string, int> _votes = new Dictionary<string, int>();

		[HttpGet("")]
        public IActionResult Get()
        {
			List<KeyValuePair<string, int>> votes = new List<KeyValuePair<string, int>>(_votes.Count);
			foreach (KeyValuePair<string, int> kvp in _votes)
			{
				votes.Add(kvp);
			}

			return new ObjectResult(votes);
        }

        [HttpPost("{key}")]
		public IActionResult Post(string key)
		{
			if (!_votes.ContainsKey(key))
			{
				_votes.Add(key, 1);
			}
			else
			{
				_votes[key] = _votes[key] + 1;
			}

			return new NoContentResult();
		}

        [HttpDelete("")]
        public IActionResult Delete()
        {
            _votes = new Dictionary<string, int>();

            return new NoContentResult();
        }

        [HttpDelete("{key}")]
        public IActionResult Delete(string key)
        {
            if (!_votes.ContainsKey(key))
			{
				return new NotFoundResult();
			}
			else
			{
				_votes.Remove(key);
			}

            return new NoContentResult();
        }
    }
}
