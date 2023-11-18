def server = Artifactory.server '<artifactory id>'
    def uploadSpec = '''{
        "files": [{
        "pattern": "<name of war or jar file>",
        "target": "<artifactory repo>/path-to/war-or-jar/file/in-Artifactory"
        }]
    }'''
    server.upload(uploadSpec)
