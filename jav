/* declare the variable */
	var welcome=`Hello Friend! 
	cool to chat with you? .
	 may I know your name and email. you can make use of the input field`;
	var summit=document.getElementById('summit');
	var form=document.getElementById('form');
	var name=document.getElementById('list1');
	var email=document.getElementById('list2');
	var input=document.getElementsByTagName('input');
	var chat=document.getElementById('chat');
	var clickme=document.getElementById('clickme');
	var begin="Welcome";
	var intro="I am a chatbot that can speak, written in JavaScript, developed by Ojurongbe Oluwabukunmi in 2022. Ojurongbe Oluwabukunmi is a Computer Programmer specialize in web Programming.";
	var help="Anyway I am just a robot, but how may I help you";
	var webspeech=`You need a professional web developer for your project. 
	what are you waiting for, incase you don't know, Ojurongbe Oluwabukunmi is a Web developer (Fullstack development).  `;
	var touch=`You can get in touch with him with this links: `;
	var more="Do you need more help?";
	var no="Anyway thanks for keeping my time,";
	var any="I really appreciate you, if you need my help again you know what to do";
	var bye=" bye for now";
	var linkers="You can use these buttons again";
	var jsspeech=`You need a JavaScript expert for your project. 
	don't you know that Ojurongbe Oluwabukunmi is a JavaScript expert.
	He know JavaScript and JQuery, the write less and do more Library   `;
	var backspeech=`Oh!
	you need a Backend developer?
	Ojurongbe Oluwabukunmi is a Backend developer with PHP Programming Language, the Hypertex Prepocessor.
	incase you don't know, PHP is the Language use in Wordpress, one of the best CMS on the internet. This give Ojurongbe Oluwabukunmi the oppurtunity to be a Wordpress Backend developer.
	You like that?`;
var chatterr=`You need a Chatbot like me?
that's nice, Ojurongbe Oluwabukunmi will surely do this for you.
He has the skills and He will never and never dissapoint you. even, I also want robot like me on the internet
 `
	var importer={
		user: "",
		first: "hello word",
	};
	/* first speech goes here */
	function talk() {
		speechSynthesis.speak(new SpeechSynthesisUtterance(welcome));
        form.style.display="inline";
        clickme.style.display="none";
        let chatbotspeech1=document.createElement("p");
        let ctext1=document.createTextNode(welcome);
        chatbotspeech1.appendChild(ctext1);
        chat.appendChild(chatbotspeech1);
        summit.addEventListener('click',function(){
        	let name=document.getElementById('list1');
        	let email=document.getElementById('list2');
        	let content=document.createElement('h2');
        	let text=document.createTextNode(name.value);
        	let content2=document.createElement('h2');
        	let text2=document.createTextNode(email.value);
        	content.appendChild(text);
        	content2.appendChild(text2);
        	chat.appendChild(content);
        	chat.appendChild(content2);
           let user=name.value;
        	form.style.display="none";
             let chatbotspeech1=document.createElement("p");
             importer.user=name.value;
        let ctext1=document.createTextNode(begin+","+user+"!.  "+intro);
        chatbotspeech1.appendChild(ctext1);
        chat.appendChild(chatbotspeech1);
        	speechSynthesis.speak(new SpeechSynthesisUtterance(begin+","+user+"!.  "+intro));
        	speechSynthesis.speak(new SpeechSynthesisUtterance(help));
        	 
        	    setTimeout(function() {
        	   	 chatbotspeech1=document.createElement("p");
        	   	 ctext1=document.createTextNode(help);
        chatbotspeech1.appendChild(ctext1);
        chat.appendChild(chatbotspeech1);
        services();
    }, 16000);
     /* option buttons goes here */
function services(){
	let chatbotbtn1=document.createElement('button');
    let content=document.createTextNode('need a Web developer');
    chatbotbtn1.appendChild(content);
    chatbotbtn1.setAttribute('onclick','web()');
    chat.appendChild(chatbotbtn1);
    let chatbotbtn2=document.createElement('button');
    content=document.createTextNode('need a Javascript expert');
    chatbotbtn2.appendChild(content);
    chat.appendChild(chatbotbtn2);
    chatbotbtn2.setAttribute('onclick','js()');
    let chatbotbtn3=document.createElement('button');
    content=document.createTextNode('need a Backend developer');
    chatbotbtn3.appendChild(content);
     chatbotbtn3.setAttribute('onclick','bd()');
    chat.appendChild(chatbotbtn3);
     let chatbotbtn4=document.createElement('button');
    content=document.createTextNode('need a Chatbot');
    chatbotbtn4.appendChild(content);
    chatbotbtn4.setAttribute('onclick','chatter()');
    chat.appendChild(chatbotbtn4);
}
        })
        }
         /* if web development button was clicked */
        function web(){
        	let button=document.getElementsByTagName('button');
        	for(var i=0;i<button.length;i++){
        		button[i].style.display="none";
        	}
        speechSynthesis.speak(new SpeechSynthesisUtterance(importer.user+webspeech));
        let me=document.createElement('h2');
        let contentme=document.createTextNode('need a Web developer');
        me.appendChild(contentme);
        chat.appendChild(me);
         let chatbotbtn5=document.createElement('p');
    content=document.createTextNode(webspeech);
    chatbotbtn5.appendChild(content);
    chat.appendChild(chatbotbtn5);
    setTimeout(function(){
    	 speechSynthesis.speak(new SpeechSynthesisUtterance(touch));
         let chatbotbtn6=document.createElement('p');
    content=document.createTextNode(touch);
    chatbotbtn6.appendChild(content);
    chat.appendChild(chatbotbtn6);
    },10000);
    setTimeout(function(){
    	speechSynthesis.speak(new SpeechSynthesisUtterance(more));
         let chatbotbtn7=document.createElement('p');
    content=document.createTextNode(more);
    chatbotbtn7.appendChild(content);
    chat.appendChild(chatbotbtn7);
       let chatbotbtn8=document.createElement('button');
    content=document.createTextNode('yes');
    chatbotbtn8.appendChild(content);
    chat.appendChild(chatbotbtn8);
    chatbotbtn8.setAttribute('onclick','yes1()');
     chatbotbtn8.setAttribute('id','yes1');
     let chatbotbtn9=document.createElement('button');
    content=document.createTextNode('no');
    chatbotbtn9.appendChild(content);
    chat.appendChild(chatbotbtn9);
    chatbotbtn9.setAttribute('onclick','no1()');
    chatbotbtn9.setAttribute('id','no1');
    },15000)
        }
        /* if javascript button was clicked */
        function js(){
        	let button=document.getElementsByTagName('button');
        	for(var i=0;i<button.length;i++){
        		button[i].style.display="none";
        	}
        	 let me=document.createElement('h2');
        let contentme=document.createTextNode('need a Javascript expert');
        me.appendChild(contentme);
        chat.appendChild(me);
        	 speechSynthesis.speak(new SpeechSynthesisUtterance(importer.user+jsspeech));
         let chatbotbtn5=document.createElement('p');
    content=document.createTextNode(importer.user+jsspeech);
    chatbotbtn5.appendChild(content);
    chat.appendChild(chatbotbtn5);
    setTimeout(function(){
    	 speechSynthesis.speak(new SpeechSynthesisUtterance(touch));
         let chatbotbtn6=document.createElement('p');
    content=document.createTextNode(touch);
    chatbotbtn6.appendChild(content);
    chat.appendChild(chatbotbtn6);
    },10000);
    setTimeout(function(){
    	speechSynthesis.speak(new SpeechSynthesisUtterance(more));
         let chatbotbtn7=document.createElement('p');
    content=document.createTextNode(more);
    chatbotbtn7.appendChild(content);
    chat.appendChild(chatbotbtn7);
       let chatbotbtn8=document.createElement('button');
    content=document.createTextNode('yes');
    chatbotbtn8.appendChild(content);
    chat.appendChild(chatbotbtn8);
    chatbotbtn8.setAttribute('onclick','yes1()');
     chatbotbtn8.setAttribute('id','yes1');
     let chatbotbtn9=document.createElement('button');
    content=document.createTextNode('no');
    chatbotbtn9.appendChild(content);
    chat.appendChild(chatbotbtn9);
    chatbotbtn9.setAttribute('onclick','no1()');
    chatbotbtn9.setAttribute('id','no1');
    },15000)
        }
        /* if backend button was clicked */
        function bd(){
        	let button=document.getElementsByTagName('button');
        	for(var i=0;i<button.length;i++){
        		button[i].style.display="none";
        	}
        	 let me=document.createElement('h2');
        let contentme=document.createTextNode('need a Backend developer');
        me.appendChild(contentme);
        chat.appendChild(me);
        	 speechSynthesis.speak(new SpeechSynthesisUtterance(backspeech));
         let chatbotbtn5=document.createElement('p');
    content=document.createTextNode(backspeech);
    chatbotbtn5.appendChild(content);
    chat.appendChild(chatbotbtn5);
    setTimeout(function(){
    	 speechSynthesis.speak(new SpeechSynthesisUtterance(touch));
         let chatbotbtn6=document.createElement('p');
    content=document.createTextNode(touch);
    chatbotbtn6.appendChild(content);
    chat.appendChild(chatbotbtn6);
    },10000);
    setTimeout(function(){
    	speechSynthesis.speak(new SpeechSynthesisUtterance(more));
         let chatbotbtn7=document.createElement('p');
    content=document.createTextNode(more);
    chatbotbtn7.appendChild(content);
    chat.appendChild(chatbotbtn7);
       let chatbotbtn8=document.createElement('button');
    content=document.createTextNode('yes');
    chatbotbtn8.appendChild(content);
    chat.appendChild(chatbotbtn8);
    chatbotbtn8.setAttribute('onclick','yes1()');
     chatbotbtn8.setAttribute('id','yes1');
     let chatbotbtn9=document.createElement('button');
    content=document.createTextNode('no');
    chatbotbtn9.appendChild(content);
    chat.appendChild(chatbotbtn9);
    chatbotbtn9.setAttribute('onclick','no1()');
    chatbotbtn9.setAttribute('id','no1');
    },15000)
        }
        /* if chatbot button was clicked */

  function chatter(){
  	let button=document.getElementsByTagName('button');
        	for(var i=0;i<button.length;i++){
        		button[i].style.display="none";
        	}
        	 let me=document.createElement('h2');
        let contentme=document.createTextNode('need a Chatbot');
        me.appendChild(contentme);
        chat.appendChild(me);
        	 speechSynthesis.speak(new SpeechSynthesisUtterance(chatterr));
         let chatbotbtn5=document.createElement('p');
    content=document.createTextNode(chatterr);
    chatbotbtn5.appendChild(content);
    chat.appendChild(chatbotbtn5);
    setTimeout(function(){
    	 speechSynthesis.speak(new SpeechSynthesisUtterance(touch));
         let chatbotbtn6=document.createElement('p');
    content=document.createTextNode(touch);
    chatbotbtn6.appendChild(content);
    chat.appendChild(chatbotbtn6);
    },10000);
    setTimeout(function(){
    	speechSynthesis.speak(new SpeechSynthesisUtterance(more));
         let chatbotbtn7=document.createElement('p');
    content=document.createTextNode(more);
    chatbotbtn7.appendChild(content);
    chat.appendChild(chatbotbtn7);
       let chatbotbtn8=document.createElement('button');
    content=document.createTextNode('yes');
    chatbotbtn8.appendChild(content);
    chat.appendChild(chatbotbtn8);
    chatbotbtn8.setAttribute('onclick','yes1()');
     chatbotbtn8.setAttribute('id','yes1');
     let chatbotbtn9=document.createElement('button');
    content=document.createTextNode('no');
    chatbotbtn9.appendChild(content);
    chat.appendChild(chatbotbtn9);
    chatbotbtn9.setAttribute('onclick','no1()');
    chatbotbtn9.setAttribute('id','no1');
    },15000)
        }
        /* if yes button was clicked */
        function yes1(){
            document.getElementById('no1').remove();
            document.getElementById('yes1').remove();
        	speechSynthesis.speak(new SpeechSynthesisUtterance(linkers));
        	let linkersi=document.createElement('p');
        	let linkersco=document.createTextNode(linkers);
        	linkersi.appendChild(linkersco);
        	chat.appendChild(linkersi);
        	let chatbotbtn1=document.createElement('button');
    let content=document.createTextNode('need a web developer');
    chatbotbtn1.appendChild(content);
    chatbotbtn1.setAttribute('onclick','web()');
    chat.appendChild(chatbotbtn1);
    let chatbotbtn2=document.createElement('button');
    content=document.createTextNode('need a javascript expert');
    chatbotbtn2.appendChild(content);
    chatbotbtn2.setAttribute('onclick','js()');
    chat.appendChild(chatbotbtn2);
    let chatbotbtn3=document.createElement('button');
    content=document.createTextNode('need a backend engineer');
    chatbotbtn3.appendChild(content);
    chatbotbtn3.setAttribute('onclick','bd()');
    chat.appendChild(chatbotbtn3);
     let chatbotbtn4=document.createElement('button');
    content=document.createTextNode('need a chatbot');
    chatbotbtn4.appendChild(content);
    chatbotbtn4.setAttribute('onclick','chatter()');
    chat.appendChild(chatbotbtn4);
        }
        /* if no button was clicked */
        function no1(){
        	 document.getElementById('no1').remove();
            document.getElementById('yes1').remove();
        	speechSynthesis.speak(new SpeechSynthesisUtterance(no+importer.user));
        	  let chatbotbtn10=document.createElement('p');
    content=document.createTextNode(no+importer.user);
    chatbotbtn10.appendChild(content);
    chat.appendChild(chatbotbtn10);
        	speechSynthesis.speak(new SpeechSynthesisUtterance(any));
        	  let chatbotbtn11=document.createElement('p');
    content=document.createTextNode(any);
    chatbotbtn11.appendChild(content);
    chat.appendChild(chatbotbtn11);
        	speechSynthesis.speak(new SpeechSynthesisUtterance(bye+importer.user));
        	  let chatbotbtn12=document.createElement('p');
    content=document.createTextNode(bye+","+importer.user);
    chatbotbtn12.appendChild(content);
    chat.appendChild(chatbotbtn12);

        }