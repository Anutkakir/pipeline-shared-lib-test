def sendSkypeMessage(message, channel, skypeSecret, skypeURL){
    log.debug(p_message)
    def skypeData = '{"channel":"' + channel + '","secret":"' + skypeSecret + '","type":"simple","text":"' + message + '"}'
    log.debug("skypeData - ${skypeData}")
    //def skypeResponse = CommonHttpRequest.CommonHttpRequest(skypeURL, skypeData, '', 'POST')
    //log.debug("skypeResponse - ${skypeResponse}")
}