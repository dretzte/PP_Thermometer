interface TemperatureObserver{
    fun update(temp : Float)
}

class TemperatureAlert(private val assignedTemperature : Int, private val msg: String): TemperatureObserver{
    override fun update(temp : Float) {
        if(temp >= assignedTemperature) println(msg)
    }
}

class WeatherReport: TemperatureObserver{
    private  var arr = mutableListOf<Float>()
    override fun update(temp: Float) {
        if (arr.size <100){
            arr.add(temp)
        }
        else if (arr.size == 100) {
            for (i in 0..99) println(arr[i])
            arr.clear()
        }

    }
}
class HeatingSystem(private val strategy: HeatingStrategy):TemperatureObserver{
    private var arr = mutableListOf<Float>()
    override fun update(temp: Float) {
        if (arr.size <10){
            arr.add(temp)
        }
        else if (arr.size == 10) {
            arr.removeAt(0)
            arr.add(temp)

        }
        if (strategy.needsHeating(arr)) println("Heizung : An")
        else println("Heizung : Aus")

    }

}