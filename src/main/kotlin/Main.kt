fun main() {
    while (true) {
        // Запрашиваем у пользователя число лайков
        print("Введите количество лайков: ")
        val likes = readLine()?.toIntOrNull()

        // Проверяем, что пользователь ввел корректное число
        if (likes != null) {
            val lastDigit = likes % 10
            val lastTwoDigits = likes % 100

            // Используем условные операторы для вывода различных вариантов в консоль
            when {
                lastTwoDigits in 11..14 -> println("$likes лайков")
                lastDigit == 1 -> println("$likes лайк")
                lastDigit in 2..4 -> println("$likes лайка")
                else -> println("$likes лайков")
            }
        } else {
            // Если пользователь ввел некорректное число, сообщаем об ошибке
            println("Некорректный ввод. Пожалуйста, введите число.")
        }
    }
}
