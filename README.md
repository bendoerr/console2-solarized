# Solarized Color Scheme for Windows Console2

Original [Solarized] Color Scheme created and developed by [Ethan Schoonover][Solarized]  <es@ethanschoonover.com>

[Console2] is a replacement for the traditional Windows Console. [Console2] add tabs, easier text editing, background and color configurations as well as other features.

Adapted for Windows Console2 by:

*  Steven Harman ~ [Website][Harman Website], [Github][Harman Github], [Twitter][Harman Twitter], <contact@stevenharman.net>
*  Ben Doerr ~ [Website][Doerr Website], [Github][Doerr Github], [Twitter][Doerr Twitter], <tiggerizzy@bendoerr.me>

## Visit the Solarized homepage

The [Solarized] homepage has great screenshots, details, and links to other adaptations of the color scheme sush as Vim, IntelliJ, and other applications.

## Downloading

**Clone the repository**

Using git clone the repository. `git clone git://github.com/bendoerr/console2-solarized.git`.

**Github**

You can download the latest code from Github [here][Download] or by clicking the 'Download' link at the top of the repository.

## Dependencies

[Groovy] 1.8+ is required to run the configuration script.

## Usage
    
    usage: configure.groovy [-options]
    Options:
     -b,--background <color>   light or dark
     -c,--config <file>        console xml config file

* Type `groovy configuration.groovy` to get usage instructions.
* To set the background to light use the `-b light` option, or to dark use the `-b dark` option.
* Console2's configuration file `console.xml` can typically be found in `~/AppData/Roaming/Console`.

Typical usage would be `groovy configuration.groovy -b light -c ~/AppData/Roaming/Console/console.xml`.

## License

Copyright (c) 2011 Ethan Schoonover

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


[Solarized]:         http://ethanschoonover.com/solarized        "Solarized Homepage: Precision colors for machines and people"
[Console2]:          http://sourceforge.net/projects/console     "Console2 Project Homeage"
[Harman Website]:    http://stevenharman.net                     "Steven Harman's Website"
[Harman Github]:     https://github.com/stevenharman             "Steven Harman's Github"
[Harman Twitter]:    http://twitter.com/stevenharman             "Steven Harman's Twitter"
[Doerr Website]:     http://bendoerr.me                          "Ben Doerr's Website"
[Doerr Github]:      https://github.com/bendoerr                 "Ben Doerr's Github"
[Doerr Twitter]:     http://twitter.com/bendoerr                 "Ben Doerr's Twitter"
[Download]:     https://github.com/bendoerr/console2-solarized/archives/master  "Download the latest code"
[Groovy]:            http://groovy.codehaus.org/                 "Please ignore the advertisements, Codehaus charges an arm and a leg."
