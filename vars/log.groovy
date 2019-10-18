//def info(message) {
//    echo "INFO: ${message}"
//}
//
//def warning(message) {
//    echo "WARNING: ${message}"
//}


def warning(message) {
    ansiColor('xterm') {
        println "\033[90m * * * * [WARNING] - ${message} \033[0m "
    }
}

def error(message, exit = true) {
    ansiColor('xterm') {
        println "\033[1;31m * * * * [Error] - ${message} \033[0m "
    }

    if ( exit ) {
        sh 'exit 1'
    }
}

def info(message) {
    ansiColor('xterm') {
        println "\033[1;34m * * * * [Info] - ${message} \033[0m "
    }
}


def debug(message) {
    ansiColor('xterm') {
        println "\033[1;30m * * * * [DEBUG] - ${message} \033[0m "
    }
}


//def call(body) {
//    new Log(script:this).run()
//    script:this.echo(new Log(1, 3))
//
//    echo "Deployed"
//
//    return this
//}



