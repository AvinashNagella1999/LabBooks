����   4 W  com/cg/lbd/ui/Lab6Ex3  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/cg/lbd/ui/Lab6Ex3; 
getSquares ([I)Ljava/util/Map; 	Signature ;([I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;  java/util/HashMap
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;    java/util/Map    put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; arr [I m Ljava/util/Map; i I LocalVariableTypeTable 7Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>; StackMapTable main ([Ljava/lang/String;)V	 - / . java/lang/System 0 1 out Ljava/io/PrintStream; 3 enter no.of elements:
 5 7 6 java/io/PrintStream 8 9 println (Ljava/lang/String;)V ; java/util/Scanner	 - = > ? in Ljava/io/InputStream;
 : A  B (Ljava/io/InputStream;)V
 : D E F nextInt ()I H enter elements in array:
  J  
 5 L 8 M (Ljava/lang/Object;)V args [Ljava/lang/String; sc Ljava/util/Scanner; n O " 
SourceFile Lab6Ex3.java !               /     *� �    
                    	            �     /� Y� L=� +*.� *.*.h� �  W�*����+�    
       
     $  -          / ! "    ' # $  
 # % &  '      ' # (  )   
 �   	 * +     �     F� ,2� 4� :Y� <� @L+� C=�
N� ,G� 46� -+� CO���� ,-� I� K�    
   * 
            $  *  2  ;  E     4    F N O    3 P Q   . R &   * ! "  '  % &  )    � *  S : T  
  U    V