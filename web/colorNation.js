function colorNation(data){
                var r = paper;
                var over = function () {
                    this.c = this.c || this.attr("fill");
                    this.stop().animate({fill: "#bacabd"}, 500);
                },
                    out = function () {
                        this.stop().animate({fill: this.c}, 500);
                    };
                r.setStart();
                
                var world = r.setFinish();
                world.hover(over, out);
                world.getXY = function (lat, lon) {
                    return {
                        cx: lon * 2.6938 + 465.4,
                        cy: lat * -2.6938 + 227.066
                    };
                };
                world.getLatLon = function (x, y) {
                    return {
                        lat: (y - 227.066) / -2.6938,
                        lon: (x - 465.4) / 2.6938
                    };
                };
                var latlonrg = /(\d+(?:\.\d+)?)[\xb0\s]?\s*(?:(\d+(?:\.\d+)?)['\u2019\u2032\s])?\s*(?:(\d+(?:\.\d+)?)["\u201d\u2033\s])?\s*([SNEW])?/i;
        
                world.parseLatLon = function (latlon) {
                    var m = String(latlon).split(latlonrg),
                        lat = m && +m[1] + (m[2] || 0) / 60 + (m[3] || 0) / 3600;
                    if (m[4].toUpperCase() == "S") {
                        lat = -lat;
                    }
                    var lon = m && +m[6] + (m[7] || 0) / 60 + (m[8] || 0) / 3600;
                    if (m[9].toUpperCase() == "W") {
                        lon = -lon;
                    }
          
                    return this.getXY(lat, lon);
                };
                    
					var ll = data["ll"];
					var acr = data["acr"];
					var country = worldmap["shapes"][acr];
					var newPath =	r.path(country);
					console.log(acr);
					var colore = color["colors"][acr];
				    var colorSommato = hex2Int(colore);
					color["colors"][acr] = colorSommato;
					newPath.stop().animate({fill: colorSommato,stroke: "none"});
                



}