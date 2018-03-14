/**
 * Created by sony on 14/3/18.
 */


fun main(args: Array<String>)
{

    var n: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)


    println("Given Array Is [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ]")
    for (p in n.indices)
    {

        if (n[p] % 2 == 0)
        {
            println("Even Number is  ${n[p]}")
        }
    }
    for (p in n.indices)
    {
        if (n[p]%2!=0)
        {
            println("Odd number is ${n[p]}")
        }

    }

}

//finish
