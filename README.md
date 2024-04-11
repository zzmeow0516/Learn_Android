Learn Android based on Kotlin

android加载布局：
1. 在 Activity 或 Fragment 中 ，使用 LayoutInflater 的 inflate函数加载布局，并将其转换成View对象。
2. 在 Activity 的 onCreate 方法中通过 setContentView 方法直接加载布局文件
3. 在 Fragment 的 onCreateView 方法中加载布局文件
4. RecyclerView 


用如下代码来设置和读取Book类中的pages字段：
val book = Book()
book.pages = 500
val bookPages = book.pages
这里看上去好像我们并没有调用Book类的setPages()和getPages()方法，而是直接对
pages字段进行了赋值和读取。其实这就是Kotlin给我们提供的语法糖，它会在背后自动将上述
代码转换成调用setPages()方法和getPages()方法。