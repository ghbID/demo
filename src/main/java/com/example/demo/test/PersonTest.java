//package com.example.demo.test;
//
///*
// * 面向对象特征之三：多态性
//
// * //**总结
// * //**只要是父类的子类都可以new。	调的是子类对父类方法的重写
// * //**比如：	父类名 变量名字 = new 子类名();//**eg Person p2 = new Man();
// * //**编译看左边是什么类型的（这是person类型的，就去找person类有没定义这个方法（没有就不行），但是调用运行时是右边类型的重写的方法）
// *
// *
// * 1.理解多态性：可以理解为一个事物的多种形态。
// * 2.何为多态性：
// *   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
// *
// * 3. 多态的使用：虚拟方法调用		//**将此时父类的方法称为虚拟方法，这样的方法调用在编译期是无法确定的
// *   有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
// *   总结：编译，看左边；运行，看右边。  //**eg Person p2 = new Man();	编译看左边是什么类型的（这是person类型的，就去找person类有没定义这个方法，但是调用运行时是右边类型的重写的方法）
// *
// * 4.多态性的使用前提：  ① 类的继承关系  ② 方法的重写
// *
// * 5.对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
// */
//public class PersonTest {
//
//
//	public static void main(String[] args) {
//
//		Person p1 = new Person();
//		p1.eat();
//
//		Man man = new Man();
//		man.eat();
//		man.age = 25;
//		man.earnMoney();
//
//		//*************************************************
//		System.out.println("*******************");
//		//对象的多态性：父类的引用指向子类的对象
//		Person p2 = new Man();		//**只要是person的子类都可以new。		父类名 变量名字 = new 子类名();
////		Person p3 = new Woman();
//		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
//		p2.eat();
//		p2.walk();
//
////		p2.earnMoney();
//
//		System.out.println(p2.id);//1001
//
//		System.out.println("****************************");
//		//不能调用子类所特有的方法、属性：编译时，p2是Person类型。
//		p2.name = "Tom";
////		p2.earnMoney();
////		p2.isSmoking = true;
//		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
//		//编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
//
//		//如何才能调用子类特有的属性和方法？
//		//向下转型：使用强制类型转换符。
//		Man m1 = (Man)p2;   //****************这
//		m1.earnMoney();
//		m1.isSmoking = true;
//
//		//使用强转时，可能出现ClassCastException的异常。
////		Woman w1 = (Woman)p2;		//**因为前面Person p2 = new Man(); 的 Man()给了p2，所以本质上p2是Man类型的。
//									//*所以这里p2不能再强转给Wonman因为Man类与Wonman类不是子父类的关系，它们是并列关系。
//									//但由于以后类可能会多所以有可能忘记是不是它的父类，所以为了避免运行出错，所以有了instanceof关键字的使用。
////		w1.goShopping();
//
//		/*
//		 * instanceof关键字的使用
//		 *
//		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
//		 *
//		 *
//		 *  使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
//		 *  进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
//		 *
//		 *  如果 a instanceof A返回true,则 a instanceof B也返回true.
//		 *  其中，类B是类A的父类。
//		 */
//		if(p2 instanceof Woman){
//			Woman w1 = (Woman)p2;
//			w1.goShopping();
//			System.out.println("******Woman******");
//		}
//
//		if(p2 instanceof Man){   //**父类的变量名 其实已经被强转了的  instanceof  子类名或它的父类名（多态性）
//			Man m2 = (Man)p2;
//			m2.earnMoney();
//			System.out.println("******Man******");
//		}
//
//		if(p2 instanceof Person){
//			System.out.println("******Person******");
//		}
//		if(p2 instanceof Object){
//			System.out.println("******Object******");
//		}
//
////		if(p2 instanceof String){
////
////		}
//
//		//练习：
//		//问题一：编译时通过，运行时不通过
//		//举例一：
////		Person p3 = new Woman();
////		Man m3 = (Man)p3;
//		//举例二：
////		Person p4 = new Person();
////		Man m4 = (Man)p4;
//		//** m4.（//**这里写Man类的方法名字）
//		//*举例二的理解：如果111行和112行过了，那么113行肯定过，但是Person类没有定义Man类的方法，所以111行和112行运行不会过。
//
//		//问题二：编译通过，运行时也通过
////		Object obj = new Woman();
////		Person p = (Person)obj;
//
//		//问题三：编译不通过
////		Man m5 = new Woman();
//
////		String str = new Date();
//
////		Object o = new Date();
////		String str1 = (String)o;
//
//
//
//	}
//}
//
////class Order{
////
////}
//
//
//
