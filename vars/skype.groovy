def private commonHttpRequest(url, data, auth, mode, headers=[[name: '', value: '']]){
    response = httpRequest authentication: auth,
            acceptType: 'APPLICATION_JSON_UTF8',
            contentType: 'APPLICATION_JSON_UTF8',
            customHeaders: headers,
            httpMode: mode,
            ignoreSslErrors: true,
            requestBody: data,
            validResponseCodes: '100:500',
            url: url,
            quiet: true

    return response
}


def sendMessage(message, channel, skypeSecret, skypeURL){
    log.debug(message)
    def skypeData = '{"channel":"' + channel + '","secret":"' + skypeSecret + '","type":"simple","text":"' + message + '"}'
    log.debug("skypeData - ${skypeData}")
    def skypeResponse = commonHttpRequest(skypeURL, skypeData, '', 'POST', headers=[[name: '', value: '']])
    log.debug("skypeResponse - ${skypeResponse}")
}

//sendMessage("test", "ann_test", "env.SKYPE_SECRET", "env.SKYPE_MSG_URL")