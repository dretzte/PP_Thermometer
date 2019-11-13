import kotlin.random.Random
interface Sensor {
    fun getTemperatur (): Float
}

class RandomSensor (private val min: Double, private val max: Double ) : Sensor{
    override fun getTemperatur(): Float = Random.nextDouble(min,max).toFloat()
}

class UpDownSensor (private var value: Float) :Sensor{
    override fun getTemperatur(): Float {
        value += Random.nextDouble(-1.0,1.0).toFloat()
        return value
    }
}