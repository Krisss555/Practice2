import kotlin.system.exitProcess

fun main(args: Array<String>) {


    //1
    val age1=42
    val age2=21
    //

    //2
    val avg1=(age1+age2)/2
    //

    //3
    /*
    val age1=42.0
    val age2=21.0
    val avg1=(age1+age2)/2
    */
    //

    //4
    val firstName:String = "Кристина"
    val lastName:String = "Саркисян"
    //

    //5
    val  fullName:String=firstName+" "+lastName
    //

    //6
    val myDetails:String= "Привет, меня зовут " + fullName
    println(myDetails)
    //

    //7
    val date = Triple(7,9,2023)
    //

    //8
    val day = date.first
    val month = date.second
    val year = date.third
    //

    //9
    //var (month, _, year)=date;
    //

    //10
    val newPair =Pair(5,year)
    //
}