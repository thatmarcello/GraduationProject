
# Командный проект по курсу Java для тестировщиков

## Описание проекта
* В репозитории находится заготовка проекта, в котором есть классы для трёх сущностей: игры (Game), игрока (Player), каталога игр (GameStore)

* Каждая игра принадлежит какому-то каталогу

* Каждый игрок может добавить себе в коллекцию игру

* Также игрок может поиграть в добавленную игру через вызов своего метода play, тогда система записывает количество часов, которые он проиграл в игру

* Информация о проигранном времени хранится и в объекте игрока, и в объекте каталога игр, в чью игру он поиграл

* Также в классе игрока и каталога игр есть методы для подсчёта разного вида статистик по играм и игрокам.

* Над каждым методом в коде есть описание того, как он должен работать. При этом часть методов в этих классах не реализована, часть реализована с дефектами.

* Задача - исправить эти дефекты и дописать нереализованные методы.

## Выполнение
1. Создание общего репозитория
1. Распределение задач. Поиск дефектов в классе Player и исправление дефектов в классе GameStore.
1. Напарник, соответственно, занимается поисков дефектов в классе GameStore и исправлением в классе Player.

## Итоги проекта
1. Все дефекты исправлены
1. Все ветки слиты в main
1. Все баг-репорты закрыты
1. CI-сборка зелёная