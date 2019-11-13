class Thermometer (private val sensor: Sensor,private val observer: TemperatureObserver){
     fun run (n: Int){
        for (i in 0 until n)
        update(sensor.getTemperatur())
    }
    private fun update(temp:Float){
        observer.update(temp)
    }
}



