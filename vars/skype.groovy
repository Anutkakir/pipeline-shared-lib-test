def sendMessage(message, channel, skypeSecret, skypeURL){
    log.debug(message)
    def skypeData = '{"channel":"' + channel + '","secret":"' + skypeSecret + '","type":"simple","text":"' + message + '"}'
    log.debug("skypeData - ${skypeData}")
    def skypeResponse = httpRequest(skypeURL, skypeData, '', 'POST', headers=[[name: '', value: '']])
    log.debug("skypeResponse - ${skypeResponse}")
}

sendMessage("test", "ann_test", "env.SKYPE_SECRET", "env.SKYPE_MSG_URL")