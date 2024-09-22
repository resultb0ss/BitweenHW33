fun main() {
    val colorsEng: List<String> = arrayListOf("red","green","balck","white")
    val colorsRus: List<String> = arrayListOf("красный","зеленый","черный","белый")
    println(colorsEng.zip(colorsRus){colorEng,colorRus ->
        "Значение: $colorEng, Перевод:$colorRus"
    })
}