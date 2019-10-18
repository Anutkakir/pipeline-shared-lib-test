def sendMessage(message, channel, skypeSecret, skypeURL){
    log.debug(message)
    def skypeData = '{"channel":"' + channel + '","secret":"' + skypeSecret + '","type":"simple","text":"' + message + '"}'
    log.debug("skypeData - ${skypeData}")
    def skypeResponse = httpRequest.commonHttpRequest(skypeURL, skypeData, '', 'POST', headers=[[name: '', value: '']])
    log.debug("skypeResponse - ${skypeResponse}")
}