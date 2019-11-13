import kotlin.math.round


class SensorLogger(private val sensor: Sensor):Sensor{
    override fun getTemperatur(): Float {
        var ret = sensor.getTemperatur()
        println(ret)
        return ret
    }
}

class RoundValues(private val sensor: Sensor) : Sensor{
    override fun getTemperatur(): Float = round(sensor.getTemperatur())

}

class SensorLimits(private val sensor : Sensor, private val min: Double, private var max :Double): Sensor{
    override fun getTemperatur(): Float {
        var temp : Float

        do {
            temp = sensor.getTemperatur()
        }while (temp !in min..max)
        return temp
    }
}

class IgnoreDuplicates(private val sensor: Sensor) : Sensor{
    private var last = 0f
    override fun getTemperatur(): Float {
        var temp : Float = 0f
        do {
            temp = sensor.getTemperatur()
        }while (temp.toInt() == last.toInt()) // Round währe auch eine option
        last = temp
        return temp
    }
}