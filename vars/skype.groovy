def sendMessage(message, channel, skypeSecret, skypeURL){
    log.debug(message)
    def skypeData = '{"channel":"' + channel + '","secret":"' + skypeSecret + '","type":"simple","text":"' + message + '"}'
    log.debug("skypeData - ${skypeData}")
    def skypeResponse = httpRequest.CommonHttpRequest(skypeURL, skypeData, '', 'POST')
    log.debug("skypeResponse - ${skypeResponse}")
}