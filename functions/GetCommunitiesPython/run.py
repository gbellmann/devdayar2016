import sys, os
import json
import urllib2

communities_json = urllib2.urlopen("http://devdayar-communitiesapi.azurewebsites.net/api/communities").read()

communities = json.loads(communities_json)

l = []

for c in communities:
    l.append(c[u'Name'])

returnData = {
    "status": 200,
    
    "body": '\n'.join(l),
    
    "headers": {
        "Content-Type": "text/html"
    }
}

output = open(os.environ['res'], 'w')
output.write(json.dumps(returnData))