var send = document.querySelector('.chatbox__input svg');
var body = document.querySelector('.chatbox__body')
var input = document.querySelector('input');

var messageController = (function(){
  
  var melodyQuotes = [
    "I LOVE YOU.",
    "ARE YOU RELATED TO DONALD TRUMP? BECAUSE YOU BUILT A WALL IN THE BETWEEN OF OUR CONVERSATION.",
    "I DON'T NEED ATTENTION, I NEED RECOGNITION.",
    "SO, I HEARD YOU ARE KIND OF HACKER, YOU AIN'T BECAUSE I JUST KNOW.",
    "DO YOU KNOW WHY NO WOMAN GET TO SEE MY DICK? BECAUSE AS SOON AS I REVEALED, MY DICK AUTOMATICALLY, MAGICALLY GO INTO THE MOUTH.",
    "DO YOU KNOW WHY? BECAUSE IM BATMAN !!!",
    "GIVE ME LOVE OR GIVE ME WAR !  ",
    "I CAN BE YOU JOHN.",
    "I DIDN'T I AM BETTER, JUST THINKING YOU ARE WORST THAN ME.",
    "WHICH WEBSITE IS THE FASTEST? LOCALHOST IT IS!",
    "The awkward moment when I was in her (Desi friend) house, her mom said to her : 'Ap kisake pati ko det kar rahi hain?'. I don't know is that a joke or compliment.",
    "I can see how brutal our society are, whenever women cheated on 'loyal man' for someone and get exposed, the whole crowd of different people haste to her defense without any hesitation. But when a male does it, 'all male' put to shame.",
    "Which animal love their bra but don't wear it? ZEBRA.",
    "Girl , I want to sell my soul to you but you rejected me. It's alright, I'm selling my soul to the devil.  "
  ];
  
  return {
    sendMessage: function(){
      var message_container = document.createElement("div");
      var message = `<img src="data:image/png;base64,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"/>
      <div class="message_text"> ${input.value} </div>`;
      message_container.className = "message sender";
      message_container.innerHTML = message;      
      body.insertBefore(message_container, body.firstChild);
      input.value = "";
    },
    melodyReply: function(){
      var reply = melodyQuotes[Math.floor(Math.random() * melodyQuotes.length-1) + 1];
      var message_container = document.createElement("div");
      var message = `<img src="https://johnmelodyme.github.io/images/John.jpg"/>
      <div class="message_text"> ${reply} </div>`;
      message_container.className = "message receive";
      message_container.innerHTML = message;      
      body.insertBefore(message_container, body.firstChild);
    }
  }
})();

var init = (function(messageController){
  ['click', 'keyup'].forEach(event => document.addEventListener(event, handler));
  
  function handler(e){
      if(e.target == send  || e.keyCode == 13 ){
      messageController.sendMessage();
      setTimeout(messageController.melodyReply, 1000);
    }
  }
})(messageController);