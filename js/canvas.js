
//window.addEventListener('load', canvasApp, false);

function canvasApp() {
    if (!document.createElement('canvas').getContext) {
        return;
    }

    var theCanvas = document.getElementById('canvas');
    var context = theCanvas.getContext('2d');

    var spriteSheet = new Image();

    spriteSheet.addEventListener('load', onImageLoaded);
    spriteSheet.src = 'img/HappyEuro.png';

    var animationStates = [
        "one", "two", "three", "four",   //erste Zeile
    ];

    //Breite und Höhe eines Sprites
    var spriteSize = 190;

    //16 Sprites pro Zeile
    var columns = 4;
    //3 Zeilen
    var rows = 1;

    //Anzahl der Frames im Sprite Sheets
    var numFrames = columns * rows;

    //aktuelle frameID (0-47)
    var frameID = 0;

    function drawCanvas() {
        context.clearRect(0, 0, theCanvas.width, theCanvas.height);

        //x-Position: Spalte * Sprite-Breite
        var sourceX = (frameID % columns) * spriteSize;

        //y-Position: Zeile * Sprite-Höhe
        var sourceY = Math.floor((frameID / columns)) * spriteSize;

        context.drawImage(spriteSheet, sourceX, sourceY, spriteSize, spriteSize, 0, 0, spriteSize, spriteSize);

        frameID++;
        if (frameID == numFrames) {
            frameID = 0;
        }
    }

    function onImageLoaded(e) {

        renderingLoop();
    }

    function renderingLoop() {

        window.setTimeout(renderingLoop, 100);
        drawCanvas();
    }

}