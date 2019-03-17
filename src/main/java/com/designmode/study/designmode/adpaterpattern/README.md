适配者模式：是一种中间件，用于不存在匹配的两者之间，将不匹配的变得匹配，作用相当于常见的转接头，转换器之类的；

**适配者模式**

适配器模式：几种实现方式

1、类适配器模式

使用已经存在的一个类，由于该类不符合现有的接口规范，导致无法访问，创建一个适配器去访问该类中的方法;
![image](https://github.com/technical-exchange/design-mode/blob/dev/src/main/resources/static/images/adapterclass.png)
)
2、对象适配器模式

![image](https://github.com/technical-exchange/design-mode/blob/dev/src/main/resources/static/images/adapterobject.png)
)

3、接口适配器模式
接口适配器使用接口中的一些方法，但是接口方法太多，不想全都实现，通过一个抽象类实现该接口，并不对接口中方法置空，在通过继承重写该类中的方法，抽象类就是适配器模式

![image](https://github.com/technical-exchange/design-mode/blob/dev/src/main/resources/static/images/adapterInterface.png)
)
优缺点
优点：
1、将目标类和适配器类解耦，通过引入一个适配器类来重用现有的适配者类，无需修改原有的代码
2、增加了类透明性和复用性，将具体的业务实现过程封装载适配者类中，对于客户端是透明的，而且提高了适    配者的复用性，同一适配者类可以在多个不同的系统中复用。
3、灵活性和扩展性都非常好，通过使用配置文件，可以很方便的更换适配器，也可以在不修改原有代码的基础上 增加新的适配器，完全复合开闭原则。
 缺点：
 一次最多只能适配一个适配者类，不能同时适配多个适配者。
 目标抽象类只能为接口，不能为类，其使用有一定的局限性。
