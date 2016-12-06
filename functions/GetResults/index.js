var http = require("http");

module.exports = function (context, req) {
    http.get({
        host: 'devdayar.azurewebsites.net',
        path: '/api/votes'
    }, function(response) {
        var votesResult = '';
        response.on('data', function(d) {
            votesResult += d;
        });
        response.on('end', function() {
            var parsed = JSON.parse(votesResult);

            var votes = parsed.sort(function(a, b){return b.value-a.value});

            http.get({
                host: 'devdayar-communitiesapi.azurewebsites.net',
                path: '/api/communities'
            }, function(resp) {
                var communitiesResult = '';
                resp.on('data', function(dt) {
                    communitiesResult += dt;
                });
                resp.on('end', function() {
                    var communities = JSON.parse(communitiesResult);

                    var votesList = [];
                    votes.forEach(function(vote){
                        var id = vote.key - 1;
                        var name = communities[id].Name;

                        var voteItem = name + ': ' + vote.value;
                        
                        votesList.push(voteItem);
                    });

                    var result = votesList.join('\n');
                    res = {
                        body: result,
                        headers: {
                            "Content-Type": "text/html"
                        }
                    };

                    context.done(null, res);
                });
            });
        });
    });
};