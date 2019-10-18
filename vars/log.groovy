def printMessage(color, type, message) {
    ansiColor('xterm') {
        println("\033[${color} * * * * [${type}] - ${message} \033[0m ")
    }
}


def warning(message) {
    printMessage("1;32m", "Warning", message)
}

def error(message, exit = true) {
    printMessage("1;31m", "Error", message)

    if ( exit ) {
        sh 'exit 1'
    }
}

def info(message) {
    //ansiColor('xterm') {
    //    println "\033[1;34m * * * * [Info] - ${message} \033[0m "
    //}
    printMessage("1;34m", "Info", message)
}


def debug(message) {
    printMessage("1;30m", "Debug", message)
}





