package Models

class Food {
    var name:String?=null
     var category:Int?=null
    var preparationOrder:String?=null

    constructor(name: String?, category: Int?, preparationOrder: String?) {
        this.name = name
        this.category = category
        this.preparationOrder = preparationOrder
    }
}