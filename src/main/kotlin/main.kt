fun main() {
    printText(agoToText(100))
    printText(agoToText(1000))
    printText(agoToText(1500))
    printText(agoToText(2000))
    printText(agoToText(53453))
    printText(agoToText(600000))
    printText(agoToText(553453))
    printText(agoToText(2))
}

fun agoToText(time: Int): String {
    return when {
        (time in 1..59) -> "Был(а) только что"
        (time in 61..60 * 60) -> "Был(а) ${time / 60} ${endingMinute(time / 60)} назад"
        (time in 60 * 60 + 1..24 * 60 * 60) -> "Был(а) в сети ${time / (60 * 60)} ${endingHour(time / (60 * 60))} назад"
        (time in 24 * 60 * 60 + 1..2 * 24 * 60 * 60) -> "Был(а) в сети сегодня"
        (time in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60) -> "Был(а) в сети вчера"
        (time > 3 * 24 * 60 * 60 + 1) -> "Был(а) в сети давно"
        else -> "Неизвестное количество секунд"
    }
}

fun endingMinute(time: Int): String {
    return when {
        (time in 11..19 || time % 10 in 5..9 || time % 10 == 0) -> "минут"
        (time % 10 == 1) -> "минуту"
        (time % 10 in 2..4) -> "минуты"
        else -> {
            ""
        }
    }
}

fun endingHour(time: Int): String {
    return when {
        (time in 11..19 || time % 10 in 5..9 || time % 10 == 0) -> "часов"
        (time % 10 == 1) -> "час"
        (time % 10 in 2..4) -> "часа"
        else -> {
            ""
        }
    }
}

fun printText(text: String) {
    println(text)
}