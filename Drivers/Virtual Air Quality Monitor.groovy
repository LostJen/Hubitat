/**
 *  Virtual Air Quality Monitor
 *
 *  This is an empty shell to be feed howevery you want from any source (or coallated sources)
 *    [My personal usage:
 *        Source: RPi Zero W to collate an attached I2C PM2.5 sensor and bluetooth data from an Airthings Wave Plus for T, H, P, CO2, TVOC, and both Radon avgs
 *        Feed: That same RPi is using the MakerAPI to populate these fields (I have no other consumers to justify MQTT overhead)]
 *  Copyright 2020 LostJen
 *
 * ------------------------------------------------------------------------------------------------------------------------------
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 * ------------------------------------------------------------------------------------------------------------------------------
 *
 */
metadata {
	definition (name: "Virtual Air Quality Monitor", namespace: "LostJen", author: "LostJen") {
        capability "Sensor"
        capability "Temperature Measurement"
		capability "Relative Humidity Measurement"
        capability "Pressure Measurement"
        capability "Carbon Dioxide Measurement"
     
        attribute "pm2.5", "number"
        attribute "tVOC", "number"
        attribute "radonShortTermAvg", "number"
        attribute "radonLongTermAvg", "number"       
	}
}