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

@Composable
fun Task5() {
    // TODO: Выровняй 2 кнопки внутри Column по центру экрана.
}

@Composable
fun Task6() {
    // TODO: Сделай Колумн который занимает весь экран, у него отступы со всех сторон 16.дп и он оранжевый
    // TODO: а внутри него 3 колумна белых, занимающих всё доступное пространство одинаковые по размеру и у них тоже пэддинг 16.дп
}

@Composable
fun Task7() {
    // TODO: Сделай родительский Колумн на весь экран. а в нем колумн 50х50 дп. Добавь дочернему Column рамку толщиной 2dp черного цвета.
}

@Composable
fun Task8() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про любимую еду.
    // В первом Column используй Arrangement.Start, во втором - Arrangement.Center, в третьем - Arrangement.SpaceBetween.
}

@Composable
fun Task9() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про музыку.
    // В первом Column используй Alignment.Start, во втором - Alignment.CenterHorizontally, в третьем - Alignment.End.
}

@Composable
fun Task10() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про науки)).
    // В первом Column используй Arrangement.Start и Alignment.Start, во втором - Arrangement.Center и Alignment.CenterHorizontally, в третьем - Arrangement.SpaceBetween и Alignment.End.
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
 * - Column располагает элементы внутри сверху вниз.
 *
 * - Arrangement управляет распределением элементов внутри Column:
 *   - Arrangement.Start — элементы сжаты к началу.
 *   - Arrangement.Center — элементы расположены по центру.
 *   - Arrangement.End — элементы сжаты к концу.
 *   - Arrangement.SpaceBetween — элементы распределены равномерно.
 *   - Arrangement.SpaceAround — свободное пространство вокруг элементов.
 *   - Arrangement.SpaceEvenly — равномерное распределение свободного пространства.
 *
 *   у Колумна есть только verticalArrangement - распределение по вертикали
 *
 * - Alignment управляет выравниванием элементов внутри Column по горизонтали:
 *   - Alignment.Start — элементы выровнены влево.
 *   - Alignment.CenterHorizontally — элементы выровнены по центру.
 *   - Alignment.End — элементы выровнены вправо.
 *
 *   у Колумна только horizontalAlignment - выравнивание по горизонтали
 *
 * - Можно вкладывать один Column в другой и использовать Modifier.weight() для размеров по пропорции.
 *
 * - Modifier.padding() позволяет добавлять отступы. одно число - отступы с 4х сторон. 2 значения = первое по горизонтали, второе по вертикали, 4 значения - все 4 стороны
 * - Modifier.background() добавляет фон для Column.
 * - Modifier.border() можно использовать для создания границы вокруг Column.
 * - Modifier.height() задаёт фиксированную высоту Column.
 * - Modifier.width() задаёт фиксированную ширину Column.
 * - Modifier.size() позволяет задать одновременно ширину и высоту Column. одно значение - ширина и высота одинаковые - квадратный. если два значения то ширина и высота разные.
 * - Modifier.fillMaxHeight() - заполняет всю возможную высоту родительского компонента.
 * - Modifier.fillMaxWidth() - заполняет доступную ширину родительского компонента.
 * - Modifier.fillMaxSize() - заполняет всю доступную ширину и высоту родительского компонента.
 * - Modifier.clip() - обрезает содержимое по заданной форме, например Modifier.clip(RoundedCornerShape(12.dp))
 */