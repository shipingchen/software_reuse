using System;
using HelloCS;

namespace Client
{
	/// <summary>
	/// Summary description for Class1.
	/// </summary>
	class Tester
	{
		public Tester()
		{
			;
		}

		public void LocalObj(string name)
		{
			Console.WriteLine ("\nTo create an instance of HelloImp");
			HelloImp obj = new HelloCS.HelloImp();  // it works, but it calls lib, not COM+ service.

			Console.WriteLine ("\nTo call obj.HelloWorld() with arg = " + name);
			string reply = obj.HelloWorld(name);
			Console.WriteLine ("the reply = " + reply);
		}

		public void RemoteObj(string name)
		{
			Console.WriteLine ("\nTo create an instance of IHello");
			Type objtype = Type.GetTypeFromProgID("HelloCS.HelloImp", true);												
			IHello obj = (HelloCS.IHello) Activator.CreateInstance(objtype);	// it works by accessing an COM+ object.			

			Console.WriteLine ("\nTo call obj.HelloWorld() with arg = " + name);
			string reply = obj.HelloWorld(name);
			Console.WriteLine ("the reply = " + reply);
		}

		[STAThread]
		static void Main(string[] args)
		{
			string name;

			if(args.Length>0) name = args[0];
			else             name = "COM+" ;
			Console.WriteLine ("\nname = " + name);


			Tester tester = new Tester();

			tester.LocalObj(name);
			tester.RemoteObj(name);
		}
	}
}
