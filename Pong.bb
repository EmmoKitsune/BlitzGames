Graphics3D 800,600
SetBuffer BackBuffer()

camera=CreateCamera()
CameraViewport camera,0,0,800,600

light=CreateLight()

PlayerOne = CreateCube()
PlayerTwo = CreateCube()

Ball = CreateSphere()

playerOneY# = 0
playerTwoY# = 0

PositionEntity PlayerOne,-4,0,5
PositionEntity PlayerTwo,4,0,5

PositionEntity Ball,2,0,5

ScaleEntity PlayerOne,0.3,0.3,0.3
ScaleEntity PlayerTwo,0.3,0.3,0.3

ScaleEntity Ball,0.3,0.3,0.3

While Not KeyHit(1)
	
	playerOneY# = 0
	playerTwoY# = 0
	
	If KeyDown(17) And EntityY(PlayerOne) < 3.2 Then playerOneY# = 0.05 ; W
	If KeyDown(31) And EntityY(PlayerOne) > -3.2 Then playerOneY# = -0.05; S
	
	If KeyDown(200) And EntityY(PlayerTwo) < 3.2 Then playerTwoY# = 0.05 ; UP
	If KeyDown(208) And EntityY(PlayerTwo) > -3.2 Then playerTwoY# = -0.05; DOWN
	
	TranslateEntity PlayerOne,0,playerOneY#,0
	TranslateEntity PlayerTwo,0,playerTwoY#,0
	
	UpdateWorld
	RenderWorld 
	
	Flip 
	
Wend
End