����   ; s  com/cg/eis/service/Service  java/lang/Object  +com/cg/eis/service/EmployeeServiceInterface emp Lcom/cg/eis/bean/Employee; <init> ()V Code
   	 
  com/cg/eis/bean/Employee
  	     LineNumberTable LocalVariableTable this Lcom/cg/eis/service/Service; input :(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V
     setEmpid (Ljava/lang/String;)V
     setName
  ! " # setSal (D)V
  % &  setDesig empid Ljava/lang/String; name sal D desig display	 / 1 0 java/lang/System 2 3 out Ljava/io/PrintStream; 5 java/lang/StringBuilder 7 Employee ID : 
 4 9 	 
  ; < = getEmpid ()Ljava/lang/String;
 4 ? @ A append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 4 C D = toString
 F H G java/io/PrintStream I  println K Name : 
  M N = getName P 	Salary : 
  R S T getSal ()D
 4 V @ W (D)Ljava/lang/StringBuilder; Y Designation : 
  [ \ = getDesig 	insurance@È     @ӈ      c Insurance--->Basic e Salary with bonus--->@�L      i Insurance--->Standard@�      m Insurance--->Premium bonus I StackMapTable 
SourceFile Service.java !              	 
     B     *� *� Y� � �           
    
                    �     "*� +� *� ,� *� )�  *� � $�                  !     4    "       " ' (    " ) (    " * +    " , (   - 
     �     q� .� 4Y6� 8*� � :� >� B� E� .� 4YJ� 8*� � L� >� B� E� .� 4YO� 8*� � Q� U� B� E� .� 4YX� 8*� � Z� >� B� E�              8  T  p         q      ] #    S     �*� � QH' ^�� 5' `�� -� .b� E'>'�cH� .� 4Yd� 8'� U� B� E� t' `�� 5' f�� -� .h� EN >'�cH� .� 4Yd� 8'� U� B� E� :' f�� 2' j�� *� .l� Eu0>'�cH� .� 4Yd� 8'� U� B� E�       F         !   " $ # ) $ B % R & Z ' ^ ( c ) | * � + � , � - � . � /    4    �       � * +  $  n o  ^  n o  �  n o  p    � B96  q    r