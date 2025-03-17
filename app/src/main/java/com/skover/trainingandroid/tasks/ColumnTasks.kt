package com.skover.trainingandroid.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skover.trainingandroid.R

//запускать приложение не надо.
// надо открыть тут в правом верхнем углу вкладку предпросмотра

//NO CHATGPT

@Composable
fun Task1() {
    // TODO: Сделай 3 текста которые располагаются сверху вниз.
    Text(text = "Вверх")
    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "Середина ")
    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "Низ")
    //тебе надо проверять задания в превью внизу. в этом задании у тебя текста налепились друг на друга потому что нет родительского Колумна.
}

@Composable
fun Task2() {
    // TODO: Сделай картинку, текст и кнопку которые располагаются посередине экрана
    Column {
        Row {
            Image(
                painter = painterResource(id = R.drawable.gubkabob),
                contentDescription = null, contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(23.dp))
                    .width(100.dp)
                    .height(100.dp)


            )
            Row {
                Text(text = "Это текст?")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Нет это патрик")
                }
            }
        }
    }
}


@Composable
fun Task3() {
    // TODO: Сделай Колумн, в котором еще один колумн который 80х80, красного цвета и находится справа посередине экрана
    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Red),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {

        }
    }
}

@Composable
fun Task4() {
    // TODO: Сделай экран в котором 3 колумна сверху вниз. все они занимают всю ширину. Первый по высоте 50дп. второй 100дп. а третий всё остальное пространство. пусть они будут 3х цветов как пельмени которые мы лепили))
    Column {
        Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFF800080))
    }
    Spacer(modifier = Modifier.height(10.dp))
    Column {
        Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFFFA500))
    }
    Spacer(modifier = Modifier.height(10.dp))
    Column {
        Modifier
            .weight(1f)
            .background(Color(0xFF40E0D0))
    }
}

@Composable
fun Task5() {
    // TODO: Выровняй 2 кнопки внутри Column по центру экрана.
    Column(
        Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {

        }
    }
}

@Composable
fun Task6() {
    // TODO: Сделай Колумн который занимает весь экран, у него отступы со всех сторон 16.дп и он оранжевый
    // TODO: а внутри него 3 колумна белых, занимающих всё доступное пространство одинаковые по размеру и у них тоже пэддинг 16.дп
    Column {
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFF800080))
        Column {
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White)
        }
        Column {
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White)
        }
        Column {
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White)
        }
    }
}

@Composable
fun Task7() {
    // TODO: Сделай родительский Колумн на весь экран. а в нем колумн 50х50 дп. Добавь дочернему Column рамку толщиной 2dp черного цвета.
    Column {
        Modifier
            .fillMaxSize()
            .border(2.dp, Color.Black)
        Column(
            modifier = Modifier
                .size(50.dp)
                .border(2.dp, Color.Black)
                .background(Color.White)
        ) {}
    }
}

@Composable
fun Task8() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про любимую еду.
    // В первом Column используй Arrangement.Top, во втором - Arrangement.Center, в третьем - Arrangement.SpaceBetween.
    Column {
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(
                    shape = RoundedCornerShape(15.dp)
                )
                .background(Color.Cyan), verticalArrangement = Arrangement.Top
        ) {
            Text(text = "Чай оооочень вкусный")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "А если еще с сахарком")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Обожаю чай")
        }
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.Magenta), verticalArrangement = Arrangement.Center
        ) {
            Text(text = "А какие я сегодня синабоны ел мммммм")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Вы даже себе не представляете")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Такой мягкий вкусный прям таял во рту")
        }
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.Unspecified),

            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Мины в лаваше")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Фаляфель")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "(я такое не люблю)")
        }

    }
}

@Composable
fun Task9() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про музыку.
    // В первом Column используй Alignment.Start, во втором - Alignment.CenterHorizontally, в третьем - Alignment.End.
    Column {
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.Unspecified),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Хочу закончить одну песню")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Ну по идеии она уже закончена ")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Осталось сыграть")


        }
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.Unspecified),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Хочу закончить свою новую мелодию по быстрей")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Довести ее до ума ")
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "И придумать слова")
        }
        Column(
            Modifier
                .weight(1f)
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.Unspecified),
            horizontalAlignment = Alignment.End
        ) {
            Text(text = "Стрiли Летять")
            Text(text = " навстречу вечной тьме")
            Text(text = "В день, когда придёт домой")

        }

    }
}


@Composable
fun Task10() {
    // TODO: Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про науки)).
    // В первом Column используй Arrangement.Top и Alignment.Start, во втором - Arrangement.Center и Alignment.CenterHorizontally, в третьем - Arrangement.SpaceBetween и Alignment.End.
    Column {
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Unspecified)
        ) {
            Text(text = "Пу пу")
            Text(text = "Кря кря")
            Text(text = "Это наука")
        }
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Unspecified)
        ) {
            Text(text = "Проверим тебя")
            Text(text = "Уровень:Изи")
            Text(
                text = "2+2*2"
            )
        }
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Unspecified)
        ) {
            Text(text = "Ооооо не смог то решить ну на по легче ")
            Text(text = "Теперь Уровень:Решит даже моя Бабушка")
            Text(text = "Шли два друго один в Киев другой на запад сколько будет стоит 1кг помидор если дерево рыбный суп ростом 3 метра ")
        }

    }
}

@Composable
fun Task11() {
    // TODO: Создай Column, в котором будет много элементов, чтобы была вертикальная прокрутка.
    // TODO: Используй Modifier.verticalScroll() для прокрутки.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Black)
                .padding(16.dp),

            ) {
            items(30) {
                Skover()
            }
        }
    }
}


@Composable
fun Task12() {
    // TODO: Создай LazyColumn.
    // TODO: В начале списка добавь item { Text("Начало") }.
    // TODO: Затем добавь список строк через items().
    // TODO: В конце списка добавь item { Text("Конец") }.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Black)
                .padding(16.dp)
        ) {

            item {
                Text("Начало", color = Color.White)
            }


            items(30) {
                Text("Элементы", color = Color.White)
            }


            item {
                Text("Конец", color = Color.White)
            }
        }
    }
}


@Composable
fun Task13() {
    // TODO: Создай Column, в котором будут 3 блока:
    // TODO: - Первый занимает 20% высоты.
    // TODO: - Второй занимает 30% высоты.
    // TODO: - Третий занимает оставшиеся 50%.
    // TODO: Используй weight() для распределения пространства.
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .background(Color.Red)
        ) {
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
                .background(Color.Green)
        ) {
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5f)
                .background(Color.Blue)
        ) {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewColumnTasks() {
    //сюда пишете задание которое сейчас делаете, чтоб смотреть что получилось
    Task3()
}

@Preview
@Composable
fun Skover() {
    Skover()
}

@Preview
@Composable
fun Skover2() {
    Skover2()
}
/**
 * Справка по Column и Modifier:
 * - Column располагает элементы внутри сверху вниз.
 *
 * - Arrangement управляет распределением элементов внутри Column:
 *   - Arrangement.Top — элементы сжаты к верху.
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