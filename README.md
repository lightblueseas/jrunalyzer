# jrunalayzer [![Build Status](https://buildhive.cloudbees.com/job/pfichtner/job/jrunalyzer/badge/icon)](https://buildhive.cloudbees.com/job/pfichtner/job/jrunalyzer/)

JRunalayzer is a FAT-Client Swing application for managing and displaying GPX files. 
GPX files can be imported using the application itselfs or alternativly placed directly in the $HOME/gpx directory. 

##Features
* Datasource implementation
* Segmentation on distances and durations
* Highlighting of distances and durations
* Overlay multiple tracks (also segmented tracks)
* Similar tracks auto-detection
* Common waypoint support



![JRunalayzer Screenshot 1](/docs/screenshots/jrunalayzer1.png?raw=true)
JRunalayzer with calendar, track list, and statistics

![JRunalayzer Screenshot 2](/docs/screenshots/jrunalayzer2.png?raw=true)
JRunalayzer with calendar, profile, and statistics

![JRunalayzer Screenshot 3](/docs/screenshots/jrunalayzer3.png?raw=true)
JRunalayzer showing the comparison view and three segmented (by time) tracks overlayed

![JRunalayzer Screenshot 4](/docs/screenshots/jrunalayzer4.png?raw=true)
JRunalayzer showing the comparison view and three segmented (by time) tracks overlayed

![JRunalayzer Screenshot 5](/docs/screenshots/jrunalayzer5.png?raw=true)
JRunalayzer showing the segment view and three segmented (by distance) tracks overlayed


##Current limitations
* Calendar plugin used hard coded icon displaying all tracks as type "running"
* Only file based datasource provided (files places in $HOME/gpx)

##Tips & tricks
* If your computer is behind a firewall you can pass java the environment variables http.proxyHost and http.proxyPort, e.g. -Dhttp.proxyHost=proxy.foo.bar -Dhttp.proxyPort=8080

##Base plugins
* Calendar plugin: Shows tracks in a calendar view
* Map plugin: Show track(s) on a map (OSM/OpenStreetMap)
* Profile plugin: Show elevation, speed and grade as chart
* Statistic plugin: Show statistics of actual loaded track
* Overall statistic plugin: Show statistics of all known tracks
*  Tracklist plugin: Show all known tracks as list including some statistics
* Track compare plugin: List tracks that are similar to the actual loaded track including some statistics
* Lap info plugin: Show statictis of the track's segments (when track is segmented)

##Technical features
* Platform independent (pure Java), runs on all Java supported platforms
* Scalable: Takes advantage of running on a multicore (CPU) machine
* Plugin/module concept (very easy to write own plugin)
* Architecture: No frame (plugin/module) does depend on any other frame (plugin/module)
* Full i18n support
