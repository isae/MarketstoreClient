package me.iisaev.kotlin.marketstore_client

/*class Params(object):

    def __init__(self, symbols, timeframe, attrgroup,
start=None, end=None,
limit=None, limit_from_start=None):
if not isiterable(symbols):
symbols = [symbols]
self.tbk = ','.join(symbols) + "/" + timeframe + "/" + attrgroup
self.key_category = None  # server default
self.start = get_timestamp(start)
self.end = get_timestamp(end)
self.limit = limit
self.limit_from_start = limit_from_start
self.functions = None

def set(self, key, val):
        if not hasattr(self, key):
raise AttributeError()
if key in ('start', 'end'):
setattr(self, key, get_timestamp(val))
else:
setattr(self, key, val)
return self

def __repr__(self):
content = ('tbk={}, start={}, end={}, '.format(
self.tbk, self.start, self.end,
) +
'limit={}, '.format(self.limit) +
'limit_from_start={}'.format(self.limit_from_start))
return 'Params({})'.format(content)*/


/*param = pymkts.Params('BTC', '1Min', 'OHLCV', limit=10)
cli = pymkts.Client()
reply = cli.query(param)
reply.first().df()*/
class Params(
    val limit: Int,
    val attrgroup: String,
    val timeframe: String,
    vararg val symbols: String
)