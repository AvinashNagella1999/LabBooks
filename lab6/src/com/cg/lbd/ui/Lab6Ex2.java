����   ; B  labFive/Exercise1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LlabFive/Exercise1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I
    !  close # labFive/AgeException % "Age of a person should be above 15
 " '  ( (Ljava/lang/String;)V	  * + , out Ljava/io/PrintStream; . 	Valid age
 0 2 1 java/io/PrintStream 3 ( println
 0 5 3 6 (Ljava/lang/Object;)V args [Ljava/lang/String; age I sc Ljava/util/Scanner; e LlabFive/AgeException; StackMapTable 
SourceFile Exercise1.java !               /     *� �    
       
             	       �     8� Y� � M,� <,� � � "Y$� &�� )-� /� N� )-� 4�   , / "  
   * 
            $  ,  /  0  7     *    8 7 8    ( 9 :   - ; <  0  = >  ?    � $ J "  @    A