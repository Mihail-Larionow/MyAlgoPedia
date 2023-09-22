package algorithms

fun euclideanAlgorithm(a: Int, b: Int): Int{
    if(a==0)
        return b
    return euclideanAlgorithm(b % a, a)
}