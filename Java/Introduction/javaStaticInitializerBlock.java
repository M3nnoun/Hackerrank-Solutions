

static int B ;
static int H ;
static boolean flag;
static Scanner sc = new Scanner(System.in);
static
{
  B=sc.nextInt();
  H=sc.nextInt();
  flag=true;

  try{
      if(B<=0 || H<=0){
          System.out.println("java.lang.Exception: Breadth and height must be positive");
          flag=false;
      }
  }
  catch(Exception e){
      System.out.println(e);
  }
}

