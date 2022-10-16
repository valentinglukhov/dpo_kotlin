fun main () {
    val firstName: String = "Valentin"
    val lastName: String = "Glukhov"
    var height: Double = 177.0
    val weight: Float = 110.0F
    var isChild = height < 150 || weight < 40
    var info = """
        First name: $firstName
        Last name: $lastName
        Height: $height
        Weight: $weight
        Is child? - $isChild
        """
    println(info)
    height = 145.0
    isChild = height < 150 || weight < 40
    info = """
        First name: $firstName
        Last name: $lastName
        Height: $height
        Weight: $weight
        Is child? - $isChild
        """
    println(info)
    info = """
        An additional option for using a regular expression
        First name: $firstName
        Last name: $lastName
        Height: $height
        Weight: $weight
        Is child? - ${height < 150 || weight < 40}
        
        """
    println(info)
}