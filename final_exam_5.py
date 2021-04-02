import tkinter

class JoesAutomotive:
    def __init__(self, parent):
        self.main_window = parent
        self.top_frame = tkinter.Frame(self.main_window)
        self.main_window.title("Joe's Automotive")
        self.bottom_frame = tkinter.Frame(self.main_window)
        self.oil = tkinter.IntVar()
        self.lube = tkinter.IntVar()
        self.rad = tkinter.IntVar()
        self.trans = tkinter.IntVar()
        self.inspect = tkinter.IntVar()
        self.muff = tkinter.IntVar()
        self.tire = tkinter.IntVar()
        self.oilb = tkinter.Checkbutton(self.top_frame, text="Oil Change- $30.00", variable=self.oil, onvalue = 30)
        self.lubeb = tkinter.Checkbutton(self.top_frame,text= "Lube Job- $20.00", variable=self.lube, onvalue = 20)
        self.radb = tkinter.Checkbutton(self.top_frame, text= "Radiator Flush- $40.00", variable=self.rad, onvalue = 40)
        self.transb = tkinter.Checkbutton(self.top_frame,text= "Transmission Flush- $100.00", variable=self.trans, onvalue = 100)
        self.inspectb = tkinter.Checkbutton(self.top_frame,text= "Inspection- $35.00", variable=self.inspect, onvalue = 35)
        self.muffb = tkinter.Checkbutton(self.top_frame,text= "Muffler Replacement- $200.00", variable=self.muff, onvalue = 200)
        self.tireb = tkinter.Checkbutton(self.top_frame, text= "Tire Rotation- $20.00", variable=self.tire, onvalue = 20)
        self.display_button = tkinter.Button(self.bottom_frame, text= "Display Charges", command=self.display_charge)
        self.quit_button=tkinter.Button(self.bottom_frame, text="Quit", command=self.main_window.destroy)
        self.total_l = tkinter.Label(self.bottom_frame, text="$0.00")
        self.top_frame.pack()
        self.bottom_frame.pack()
        self.oilb.pack()
        self.lubeb.pack()
        self.radb.pack()
        self.transb.pack()
        self.inspectb.pack()
        self.muffb.pack()
        self.tireb.pack()
        self.display_button.pack(side='left')
        self.quit_button.pack(side='left')
        self.total_l.pack(side='left')
    def display_charge(self):
        self.total_l.config(text="${}.00".format(sum(map(tkinter.IntVar.get, [self.oil, self.lube, self.rad, self.trans, self.inspect, self.muff,self.tire]))))

if __name__ == "__main__":
        root = tkinter.Tk()
        gui = JoesAutomotive(root)
        root.mainloop()