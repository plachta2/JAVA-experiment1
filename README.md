# JAVA-experiment1
JAVA第一次实验
# 计191 王博涛 2019310193
# 实验内容
## (1)基本要求
    用类描述计算机中CPU的速度和硬盘的容量。要求JAVA应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。
## (2)附加要求
    a)类中定义不少于两个构造方法；
    b)每个类定义不少于2个属性，且属性的类型应该多样化；
    c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
    d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
# 实验设计
    想要实现模拟PC机程序，首先要先构思好每个部分的作用。我的思路是创建3个类，分别为PC、CPU和HardDisk。意思是主机、处理器和硬盘，然后在另一个类，也就是Test中创建对象并设置其他类的值，或实现打印功能。
    
    在CPU类中，我定义了三个变量，分别是speed、brand和oc，意思是速度，品牌和最大超频。根据现实，处理器品牌不会进行隐藏，所以没有进行private私有化处理，但速度和超频设置了。在setoc方法中，如果超频符合4.7至5.3GHz，处于正常范围，才能被给与数值，此处使用if来判断。
    
    在HardDisk类中，我定一个amount、brand和num变量，意思是容量，品牌和通电次数，我把通电次数和容量设置为了私有，容量和通电次数如果符合现实常识才能给与数值。
    
    在PC类中，主要用来调用setCPU和setHardDisk方法，并且编写了show方法来打印出CPU和HardDisk中所有的数据。
    
    Test类则是用来创建对象，并且给与设定的值，是主类。
# 核心方法
    本次实验的核心代码我认为有很多：
`CPU cpu =new CPU();`
    用来创建对象 
    
`cpu.brand="Intel";`
    用来赋值
    以及： 
    
`private int oc`
    用来设置访问权限，合理地设置私有变量
    还有： 
    
 `public void setAmount(int amount){
		if(amount>1&&amount<20000) {
			this.amount=amount;
		}
	}`
    if判断是否合理，根据情况赋给amount值 
    
    
# 实验结果
    很顺利的打印出了我所赋予的值。结果如下图：
![实验结果截图](https://raw.githubusercontent.com/plachta2/JAVA-experiment1/main/441.png)

# 实验感想
    此次实验使我认识到了类之间的配合工作原理，多个类互相调用会更加简洁，便携。当我们定义私有变量时，要思考什么应该定义为私有，什么不应该，这将影响其他类中某些方法的访问的权限。而且，我们还应当思考变量的取值范围，当赋值给变量的时候，应当通过方法来判断数据是否合理，再进行赋值。以上是我对这次实验的理解和感悟。
