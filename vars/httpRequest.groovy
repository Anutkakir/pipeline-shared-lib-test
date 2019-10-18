def call(body) {
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

    //return response
    return this
}


//def commonHttpRequest(url, data, auth, mode, headers=[[name: '', value: '']]){
//    response = httpRequest authentication: auth,
//            acceptType: 'APPLICATION_JSON_UTF8',
//            contentType: 'APPLICATION_JSON_UTF8',
//            customHeaders: headers,
//            httpMode: mode,
//            ignoreSslErrors: true,
//            requestBody: data,
//            validResponseCodes: '100:500',
//            url: url,
//            quiet: true
//
//    return response
//}