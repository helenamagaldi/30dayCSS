var nodes = document.getElementsByTagName('button');
    
for (var i = 0, size = nodes.length; i < size; i++) {
  nodes[i].addEventListener('click', function(i) {
    console.log('You clicked element index' + i);
  }.bind(null, i));
}
