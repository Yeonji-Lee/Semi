<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<form id="ajaxform" action="upload.file" method="post" enctype="multipart/form-data">
    <input type="file" multiple id="photo_upload">
    <output id="list"></output>
    <input type="button" value="완료" id="files_send">
</form>

<script>
$(document).on('click', '#files_send', function () {
    var formData = new FormData();
         
    for(var i=0; i<$('#photo_upload')[0].files.length; i++){
        formData.append('uploadFile', $('#photo_upload')[0].files[i]);
    }
 
    $.ajax({
        url: 'upload.file',
        data: formData,
        processData: false,
        contentType: false,
        type: 'POST',
        success: function (data) {
            alert("이미지 업로드 성공");
        }
    });
});
 
function handleFileSelect(evt) {
    var files = evt.target.files; // FileList object
 
    // Loop through the FileList and render image files as thumbnails.
    for (var i = 0, f; f = files[i]; i++) {
         // Only process image files.
        if (!f.type.match('image.*')) {
            continue;
        }
        var reader = new FileReader();
        // Closure to capture the file information.
        reader.onload = (function (theFile) {
            return function (e) {
                // Render thumbnail.
                var span = document.createElement('span');
                span.innerHTML = ['<img class="thumb" src="', e.target.result,
                        '" title="', escape(theFile.name), '"/>'].join('');
                document.getElementById('list').insertBefore(span, null);
            };
        })(f);
 
        // Read in the image file as a data URL.
        reader.readAsDataURL(f);
    }
}


</script>
</body>
</html>