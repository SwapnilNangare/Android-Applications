package com.example.allprogramskotlin

/*

kotlin Concepts
* var and Val
* kotlin Operator 1.Arithmetic,Assignments,comparison,Logical
* control Statements and Loops 1 if,if..else,do..while,When,for loop
* Break and Continue
* Array
* kotlin ranges
* kotlin functions,function with parameter
* kotlin oop
* classes and objects
* constructor
* inheritance open keyword
* Idioms
* Lazy Keyword
* Data Class
* Extension Function
* object class/singleton class
* visibility modifiers 1 public,private,protected,internal

* NUll safety   ?. safe call,?:Elves,?.let{} safe call with let,!! not null assertion
use for avoid Null pointer exception
fist check and if null does not call function otherwise call function
?. Safe call  ->
?: Elves   ->
?.let{} safe call with let ->multiple statement execute at a time
!!  -> if null value throw exception

* Scope Function -> let,with,run,also,apply
* coroutines:Running heavy operation we create worker or background thread that called coroutines
 very very cheap almost free of cost

Android Concepts

* Activity ->login,sing up,Home screen
* Activity LifeCycle ->onCreate(),onStart(),onResume(),onPause(),onStop(),onDestroy()
* View-> A view is a small rectangular box that responds to user inputs. Eg: EditText, Button, CheckBox, etc.
* Intent and Intent filter:: ,Implicit intent and Explicit.
* Layout -> Liner,Relative,constraint,table,frame,List,Grid,Absolute Layout

* Fragment ::Communication->Interface,viewModel,bundle
   *Livedata-> configuration changes such as screen rotations,
   *ViewModel: is manage UI related data as like orientation

* Fragment Life Cycle ->onAttach,onCreate,onCreateView,onActivityCreated,onStart,onResume,onPause,onStop,onDestroyView,onDestroy,onDetach

* Back Stack // task and stack ->mod:Standard, singleTop,single task,single Instances
* Dialogs -> AlertDialogs,DataPikerDialogs,TimePikerDialogs,SetPositiveButton,SetNegativeButton.
* Android Services->Type-> foreground,background,bound services,CallBacks->onBind,onCreate,onStartCommand,onDestroy

* Intent Services:

 Android BroadCast Receiver ->AirplaneMood,charging connected or not,public class MyReceiver extends BroadcastReceiver{}
 registerReceiver,unregisterReceiver
type->Dynamic->Through intent Filter  and static->manifest Declaration
*Implicit BroadCast->Through intent Filter

* Notification->notificationManager,setNotification(),setIcon(),setContentTitle(),setContentText(),setPriority()

 * content provider ->content resolver class ,URI,fetching data ,Ex:Contact,CRUD operation
      A Cursor object provides random read access to the rows and columns it contains.

* permission -> Normal and Dangerous.
* user Location ->fusedLocationProvider(),foreground Location,background Location. getLastLocation(),requestLocationUpdate()
* Data file and Storage -> App specific storage,sharad storage,internal and external storage
* Retrofit Network call->API key,API calling,callbacks(),convert and creating retrofit object,1.1 onCreateViewHolder,2 onBindViewHolder,
getItemCount
* Glide Library->img loading




fun main()
{
    println("class and object")

    var c1=car()
    c1.brand="Maruti"
    c1.model="S class"
    c1.price=1234

    println(c1.brand)
    println(c1.model)
    println(c1.price)



}
class car
{
    var brand=""
    var model=""
    var price=0
}
*/

//Inheritances Example
/*
fun  main()
{
    println("Inheritances Example")
    val obj=Child()
    obj.printFun()


}
open class Parent
{
val x=10
}
class Child: Parent()
{
fun printFun()
{
    println("Value of x is "+x)
}
}
 */

// data class is Deal with data not object that way we use data class
/*
fun  main()
{
    println("Data class")

    var u1=user("Swapnil",12)
    var u2=user("Swapnil",12)

    if(u1==u2)
        println("Equal")
    else
        println("Not Equal")

    //data class methods
    //println(u1.toString())
    //var newUser=u1.copy(name="peter)//override name
    //println(newUser)

}

data class user(val name:String,val id:Int)
{

}
*/

//Extension Function
/*
fun main()
{
    val num=10
    num.arithmetic(20)
}
fun Int.arithmetic(num:Int)
{
    println("Addition is ${this+num}")
}
*/
//singleton class or object class
//class name is object and this object is use to directly same as object
/*
fun main()
{
    println("Singleton class or Object class")
    print(Student.add(10,20))

}
object  Student
{
fun add(num1:Int,num2:Int):Int
{
    return num1+num2
}
}
 */

//companion object,companion class
//static variables using companion object, variables covert into static fields by using companion object.
/*
fun main()
{
    println("Static or companion object,companion class")
    println(myClass.count)
    println( myClass.Type())
}
class myClass
{
    companion object
    {
        var count:Int=10 //Static
        fun Type():String //Static
        {
            return "Swapnil"
        }

    }
}

*/

