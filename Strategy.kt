

interface HeatingStrategy {
    fun needsHeating(last10measurements : List<Float>) : Boolean
}

class InstantHeatingStrategy : HeatingStrategy{
    override fun needsHeating(last10measurements: List<Float>): Boolean =last10measurements.last() <19

}

class SensibleHeatingStrategy: HeatingStrategy{
    override fun needsHeating(last10measurements: List<Float>): Boolean = last10measurements.any {it < 20}
}

class ReasonableHeatingStrategy :HeatingStrategy{
    override fun needsHeating(last10measurements: List<Float>): Boolean {
        var count =0
        for (i in last10measurements){
            if(i < 15) return true
                 if (i <19) {
                     count++
                 }
        }
        return count >= 5
    }
}