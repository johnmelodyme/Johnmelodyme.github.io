
$(document).ready(function(){
    $('#search').click(function(){
      
     var searchTerm = $('#searchInput').val();
      
      if(!searchTerm){
      $("#output").html("No results found<br>Make sure search field is properly filled.")
      }else {
     var url = "https://en.wikipedia.org/w/api.php?action=opensearch&search="+searchTerm+"&format=json&callback=?";
      
  $.ajax({
    type: 'GET',
     url: url,
      async: false,
       dataType: 'json',
        success: function(data){
         $('#output').html(' ');
          for(i=0;i<data[1].length;i++){
           $('#output').append("<li><a href="+data[3][i]+" target='_blank'>"+data[1][i]+"</a><p>"+data[2][i]+"</p></li>");
          }
    
        }
  
        }); 
      }
      
    });
    
  });