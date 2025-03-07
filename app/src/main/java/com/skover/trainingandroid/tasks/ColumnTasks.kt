package com.skover.trainingandroid.tasks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//запускать приложение не надо.
// надо открыть тут в правом верхнем углу вкладку предпросмотра

//NO CHATGPT

@Composable
fun Task1() {
    // TODO: Сделай 3 текста которые располагаются сверху вниз.
}

@Composable
fun Task2() {
    // TODO: Сделай картинку, текст и кнопку которые располагаются посередине экрана
}

@Composable
fun Task3() {
    // TODO: Сделай Колумн, в котором еще один колумн который 80х80, красного цвета и находится справа посередине экрана
}

@Composable
fun Task4() {
    // TODO: Сделай экран в котором 3 колумна сверху вниз. все они занимают всю ширину. Первый по высоте 50дп. второй 100дп. а третий всё остальное пространство. пусть они будут 3х цветов как пельмени которые мы лепили))
}

@Preview(showBackground = true)
@Composable
fun PreviewColumnTasks() {
    Column(Modifier.fillMaxSize()) {
        //сюда пишете задание которое сейчас делаете, чтоб смотреть что получилось
        Task1()
    }
}

/**
 * Справка по Column и Modifier:
 * - Column располагает элементы сверху вниз.
 * - Modifier.fillMaxSize() - заполнения максимальное пространство.
 * - Arrangement управляет распределением элементов внутри Column:
 *   - Arrangement.Start — элементы сжаты к началу.
 *   - Arrangement.Center — элементы расположены по центру.
 *   - Arrangement.End — элементы сжаты к концу.
 *   - Arrangement.SpaceBetween — элементы распределены равномерно.
 *   - Arrangement.SpaceAround — свободное пространство вокруг элементов.
 *   - Arrangement.SpaceEvenly — равномерное распределение свободного пространства.
 * - Alignment управляет выравниванием элементов внутри Column по горизонтали:
 *   - Alignment.Start — элементы выровнены влево.
 *   - Alignment.CenterHorizontally — элементы выровнены по центру.
 *   - Alignment.End — элементы выровнены вправо.
 * - Можно вкладывать один Column в другой и использовать Modifier.weight() для гибкого распределения пространства.
 * - Modifier.padding() позволяет добавлять отступы вокруг Column.
 * - Modifier.background() добавляет фон для Column.
 * - Modifier.border() можно использовать для создания границы вокруг Column.
 * - Modifier.height() задаёт фиксированную высоту Column.
 * - Modifier.width() задаёт фиксированную ширину Column.
 * - Modifier.size() позволяет задать одновременно ширину и высоту Column.
 * - Modifier.fillMaxHeight() заставляет Column заполнять доступную высоту родителя.
 * - Modifier.fillMaxWidth() заставляет Column заполнять доступную ширину родителя.
 * - Modifier.fillMaxSize() заставляет Column заполнять всю доступную ширину и высоту родителя.
 */