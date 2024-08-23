var counter = 0;

document.getElementById('addDivBtn').onclick = function() {
    counter++; // Increment counter for unique ID

    // Create div with a textbox and remove button
    var div = document.createElement('div');
    div.className = 'dynamic-div';
    div.id = 'div-' + counter;

    div.innerHTML = `
        <input type="text" id="textbox-${counter}" placeholder="Enter text here...">
        <button class="removeDivBtn" onclick="removeDiv('div-${counter}')">Remove</button>
    `;

    // Append the new div to the container
    document.getElementById('container').appendChild(div);
};

function removeDiv(divId) {
    var div = document.getElementById(divId);
    if (div) {
        div.remove();
    }
}
