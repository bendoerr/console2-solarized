def cli = new CliBuilder(usage: 'configure.groovy [-options]',
                         header: 'Options:')
cli.with {
    c longOpt:'config', args:1, argName:'file', required:true, 'console xml config file'
    b longOpt:'background', args:1, argName:'color', required:true, 'light or dark'
}

def options = cli.parse(args)
if(!options) return

def configLoc = options.c
def background = options.b

assert background == "light" || background == "dark", "Background must be either light or dark."

// read the values, ignore lines that start with ", tokenize each line, first is the name, 10 is R value, 11 is G value, 12 is B value
def values = [:]
new File('values').eachLine {
    if(it[0] == '"') return
    def line = it.tokenize(' ')
    values.put line[0], [r:line[9], g:line[10], b:line[11]]
}

values.each { println it }

def config = new File(configLoc)
assert config.exists(), "No config file found at \"$configLoc\""

def console = [ // ids 0-15
    text:'7',
    background:'0',
    cursor:'15', // selection highlight
    bold: '9', // ls directories // blue
    accent: 10, // ls executables // green
    blue: 1,
    green: 2,
    teal: 3,
    darkred: 4,
    magenta: 5,
    gold: 6,
    darkgrey: 8,
    cyan: 11,
    red: 12,
    pink: 13,
    yellow: 14,
]

def light = background == "light"

def configXml = new XmlSlurper().parse(config)
def colors = {
    colors {
        values.with {
            color([id: console.background] << (light ? base3 : base03))
            color([id: console.text] << (light ? base00 : base0))
            color([id: console.cursor] << (light ? base02 : base2))
            color([id: console.bold] << (light ? base01 : base1))
            color([id: console.accent] << (light ? base1 : base01))
            color([id: console.blue] << blue)
            color([id: console.green] << green)
            color([id: console.teal] << violet)
            color([id: console.darkred] << orange)
            color([id: console.magenta] << magenta)
            color([id: console.gold] << yellow)
            color([id: console.darkgrey] << (light ? base0 : base00))
            color([id: console.cyan] << cyan)
            color([id: console.red] << red)
            color([id: console.pink] << magenta)
            color([id: console.yellow] << yellow)
        }
    }
}
if(configXml.console.colors) {
    configXml.console.colors.replaceNode colors
} else {
    configXml.console.colors.appendNode colors
}

config.write(new groovy.xml.StreamingMarkupBuilder().bind { mkp.yield configXml }.toString())
