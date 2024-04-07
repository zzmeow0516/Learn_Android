Learn Android based on Kotlin

android加载布局：
1. 在 Activity 或 Fragment 中 ，使用 LayoutInflater 的 inflate函数加载布局，并将其转换成View对象。
2. 在 Activity 的 onCreate 方法中通过 setContentView 方法直接加载布局文件
3. 在 Fragment 的 onCreateView 方法中加载布局文件
4. RecyclerView 