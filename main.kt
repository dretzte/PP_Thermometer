


fun main() {
    var strat1 = InstantHeatingStrategy()
    var strat2 = SensibleHeatingStrategy()
    var strat3 = ReasonableHeatingStrategy()


   /* println("37 /Ganz schön heiß ")
    var thermometer = Thermometer(
        SensorLogger(RoundValues(RandomSensor(0.0, 50.0))),
        TemperatureAlert(37, "Ganz schön heiß")
    )
    thermometer.run(10)
*/
/*  println("Limets -1.0 / 8.0")
    var thermometer = Thermometer(
        SensorLimits(RandomSensor(-10.0, 10.0), -1.0, 8.0),
        WeatherReport()
    )
    thermometer.run(103)


 */
/*
    println("InstantHeatingStrategy")
    var thermometer = Thermometer(
        SensorLogger(RandomSensor(14.0,25.0)),
        HeatingSystem(strat1)
    )
    thermometer.run(12)


 */

    /*println("SensibleHeatingStrategy")
    var thermometer = Thermometer(
        SensorLogger(RandomSensor(18.0,30.0)),
        HeatingSystem(strat2)
    )
    thermometer.run(10)



     */
/*
    println("ReasonableHeatingStrategy()")
    var thermometer = Thermometer(
        SensorLogger(RandomSensor(10.0,25.0)),
        HeatingSystem(strat3)
    )
    thermometer.run(10)


 */
   /* println("up down+ round")
    var thermometer = Thermometer(
        SensorLogger(RoundValues(UpDownSensor(21.0f))),
        TemperatureAlert(18,"Es wird Kalt")
    )
    thermometer.run(10)
    */
    /*
    println("IgnoreDuplicates")
    var thermometer = Thermometer(
        SensorLogger(IgnoreDuplicates(RandomSensor(14.0,25.0))),
        WeatherReport()
    )
    thermometer.run(114)


     */

}